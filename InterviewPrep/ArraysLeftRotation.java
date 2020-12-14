static int[] rotLeft(int[] a, int d) {
    int[] rotated = new int[a.length];
    int rot = d;
    int i = 0;
    
    while (rot < a.length){
        rotated[i] = a[rot];
        i++;
        rot++;
    }
    rot = 0;
    while (rot < d){
        rotated[i] = a[rot];
        i++;
        rot++;
    }
    
    return rotated;
}