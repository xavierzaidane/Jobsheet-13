public class Gratitude25{

    public void sayThankyou() {
        System.out.println("Thank you for being awesome!");
    }


    public void sayAdditionalGreetings(String additionalMessage) {
        System.out.println("Additional Greetings: " + additionalMessage);
    }

    public static void main(String[] args) {
 
        Gratitude25 gratitudeInstance = new Gratitude25();


        gratitudeInstance.sayThankyou();


        gratitudeInstance.sayAdditionalGreetings("Wishing you a fantastic day!");
    }
}