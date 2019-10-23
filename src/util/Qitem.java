package util;

public class Qitem {
    public String node;
    public int parent_pos;
    public int step;

    public Qitem(String node, int parent_pos, int step) {
        this.node = node;
        this.parent_pos = parent_pos;
        this.step = step;
    }
}
