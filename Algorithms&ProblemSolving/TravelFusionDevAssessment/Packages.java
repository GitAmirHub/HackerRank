public class Packages {
    //Find the smallest amount of packages needed to fit the items. Packages must be full.
public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
    int totalPackages = availableLargePackages + availableSmallPackages;
    int packages = 0;
    for (int i = 0; i < availableLargePackages; i++){
        if (items > 5){
            items = items - 5;
            packages++;
        }
                //System.out.println("Line 11 (Inside for loop) Packages: " + packages);
                //System.out.println("Line 12 (Inside for loop) Items count: " + items);
    }
    //System.out.println("Line 14 Packages: " + packages);
    //System.out.println("Line 15 Items count: " + items);
    for (int j = 0; j < availableSmallPackages; j++){
        if (items > 0){
            items = items - 1;
            packages++;
        }
                //System.out.println("Line 21 (Inside 2nd for loop) Packages: " + packages);
                //System.out.println("Line 22 (Inside 2nd for loop) Items count: " + items);
    }
    if (packages > totalPackages || !(items==0)){
        return -1;
    }
    return packages;
}

public static void main(String[] args) {
    System.out.println(minimalNumberOfPackages(22, 2, 10));
}
}