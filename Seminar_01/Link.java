package Seminar_01;

public class Link extends Human {
    private String children;

    public Link(String name, String children) {
        super(name);
        this.children = children;       
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return super.toString() + " ---> " + children;
    }
}
