public class Main {
    public static void main(String[] args) {
        
        boolean isRainy = false;
        boolean hasUmbrella = false;

        if (isRainy == true && hasUmbrella == true) {
            System.out.println("Take your umbrella."); 
                } else if (isRainy == true || hasUmbrella == true) {
                    System.out.println("It's either raining or you have an umbrella, or both!");
                } else {
                    System.out.println("Its not raining. You need some fruit.");
                }
            }
        }
