package composite;

public class CompositeExecutor {

    public static void main(String[] args) {
        System.out.println("Making root entries....");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        rootDir.printList();
        System.out.println();

        System.out.println("Making user entires...");
        Directory youngjin = new Directory("youngjin");
        Directory gunha = new Directory("gunha");
        Directory jihwan = new Directory("jihwan");

        usrDir.add(youngjin);
        usrDir.add(gunha);
        usrDir.add(jihwan);

        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));

        gunha.add(new File("memo.tex", 300));

        jihwan.add(new File("game.doc", 400));
        jihwan.add(new File("junk.mail", 500));
        rootDir.printList();
    }
}
