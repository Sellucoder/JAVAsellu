enum TrafficSignal {
    RED("stop"), GREEN("go"), YELLOW("slow down");
    String action;

    public String getAction() {
        return action;
    }

    TrafficSignal(String action) {
        this.action = action;
    }
}


class EnumExample3 {

    public static void main(String args[]) {
        TrafficSignal s = TrafficSignal.YELLOW;
        System.out.println(s.getAction());

    }
}