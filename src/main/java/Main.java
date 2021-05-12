public class Main {
    public static void main(String[] args) throws InterruptedException {
        CharacterThread characterThread = new CharacterThread();
        characterThread.start();
     /*   characterThread.setPriority(1);*/
        /*characterThread.join();*/
        NumberThread numThread = new NumberThread();
        Thread numberThread = new Thread(numThread);
        //numberThread.setDaemon(true);

        numberThread.start();
        /*numberThread.setPriority(10);*/


    }
}
