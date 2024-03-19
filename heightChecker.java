class heightChecker {
    public int heightChecker(int[] heights) {
        
        List<Integer> l= new ArrayList<Integer>();
        int i=0;
        int count=0;
        for(int num:heights)
        {
            l.add(num);
        }
        Arrays.sort(heights);
        System.out.println(l);
        for(int num:l)
        {
            if(num!=heights[i])
            {
                count++;
            }
            i++;
        }
        return count;
    }
}