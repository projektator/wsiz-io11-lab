package pl.edu.wsiz.io11.demo.package3;

public class Tree implements Growable {

    public Tree(int height) {
        this.height = height;
    }

    private int height;

    @Override
    public void grow() {
        height += 3;
    }

    @Override
    public String toString() {
        return "Tree{" + "height=" + height + '}';
    }

}
