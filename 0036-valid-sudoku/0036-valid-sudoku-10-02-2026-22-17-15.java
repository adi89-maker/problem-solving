class Solution {
    public boolean isValidSudoku(char[][] b) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]=='.'){
                    continue;
                }
               
                String r= i+"row"+b[i][j];
                String c=j+"col"+b[i][j];
                String box=b[i][j]+"box"+(i/3)+(j/3);
                if(!s.add(r)){
                    return false;
                }
                if(!s.add(c)){
                    return false;
                }
                if(!s.add(box)){
                    return false;
                }

                
            }
        }
        return true;
    }
}