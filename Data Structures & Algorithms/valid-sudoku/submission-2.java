class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> boxes = new HashMap<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                char ch = board[i][j];
                if(ch == '.') continue;
                int num = Integer.parseInt(ch+"");
                int box = (i-(i%3))*10+(j-(j%3));
                boxes.putIfAbsent(box, new HashSet<>());
                rows.putIfAbsent(i, new HashSet<>());
                cols.putIfAbsent(j, new HashSet<>());
                if(rows.get(i).contains(num) || cols.get(j).contains(num)|| boxes.get(box).contains(num) ) return false;
                rows.get(i).add(num);
                cols.get(j).add(num);
                boxes.get(box).add(num);
            }
        }

        return true;
    }
}
