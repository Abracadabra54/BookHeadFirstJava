package page358;

public class TestExceptions {

    public static void main (String [] args){
        String test = "yes";
        try{
            System.out.println("Start of try");
            doRisky (test);
            System.out.println("End of try");
        } catch (ScaryException se){
            System.out.println("Terrible excaption");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End of main");
    }

    static void doRisky (String test) throws ScaryException {
        System.out.println("Start of doRisky");
        if ("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("End of doRisky");
        return;
    }

    private static class ScaryException extends Exception {
    }
}