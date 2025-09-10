abstract  class Turn {
    abstract void turnon();

    abstract void turnoff();
}
    class TVRemote extends Turn{
        @Override
        void turnon() {
            System.out.println("tV is turned on");
        }

        @Override
        void turnoff() {
            System.out.println("tV is turned off");
        }
    }
    public class myclass{
        public static void main(String[] args) {
            Turn remote= new TVRemote();
            remote.turnon();;
            remote.turnoff();
        }
    }