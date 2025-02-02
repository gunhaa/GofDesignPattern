package visitor;

public class ListVisitor extends Visitor{

    // 현재 디렉토리
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String saveDir = currentDir;
        currentDir = currentDir+"/"+directory.getName();
        
        // 확장된 for문은 iterable 클래스 안에서 루프를돈다
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
