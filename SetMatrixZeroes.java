   public void setZeroes(int[][] matrix) {
     //taking two sets which will add the row and col of the cell which is 0
     Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
     
     
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
     
     //travelling though every row and conveting it to 0 same for col
        for(int r : row){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[r][i] = 0;
            }
        }
        for(int c : col){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
    }
