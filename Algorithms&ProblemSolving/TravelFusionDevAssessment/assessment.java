// import java.util.List;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.concurrent.Callable;


//     //Find the smallest amount of packages needed to fit the items. Packages must be full.
//     public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
//         int totalPackages = availableLargePackages + availableSmallPackages;
//         int packages = 0;
//         for (int i = 0; i < totalPackages; i++){
//             if (items > 5){
//                 items = items -5;
//                 packages++;
//                 totalPackages--;
//             }else if (items > 1){
//                 items = items - 1;
//                 packages++;
//                 totalPackages--;
//             }
//         }
//         if (packages > totalPackages){
//             return -1;
//         }
//         return packages;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(minimalNumberOfPackages(16, 2, 10));
//     }


//     //https://i.imgur.com/HqvM9ER.png
//     interface Bird {
//         Egg lay();
//     }
    
//     class Chicken {
//         public Chicken() {
//         }
    
//         public static void main(String[] args) throws Exception {
//             Chicken chicken = new Chicken();
//             System.out.println(chicken instanceof Bird);
//         }
//     }
    
//     class Egg {
//         public Egg(Callable<Bird> createBird) {
//             throw new UnsupportedOperationException("Waiting to be implemented.");
//         }
    
//         public Bird hatch() throws Exception {
//             throw new UnsupportedOperationException("Waiting to be implemented.");
//         }

//         //create soloution that returns only the non duplicates in a list. 
// }