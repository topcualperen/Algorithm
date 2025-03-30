ComparetheTripletsublic static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    List<Integer> list = new ArrayList<>();
    
    int scoreA = 0;
    int scoreB = 0;
    
    for (int i = 0; i < a.size(); i++){
        
        if (a.get(i) > b.get(i)) scoreA++;
        if (b.get(i) > a.get(i)) scoreB++;
    }
    
    list.add(scoreA);
    list.add(scoreB);
    
    return list;
}