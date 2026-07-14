class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        if(n==0) return new String();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++) {
            int l = strs.get(i).length();
            res.append(l);
            res.append(',');
        }
        res.append('#');

        for(int i=0; i<n; i++) {
            res.append(strs.get(i));
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> list = new ArrayList<>();
        if(n==0){
            return list;
        }
        ArrayList<Integer> lengths = new ArrayList<>();
        int i;
        for(i=0; i<n; i++) {
            char ch = str.charAt(i);
            if(ch == '#') break;

            int num = 0;
            while(ch!=',') {
                num*=10;
                num += Integer.parseInt(ch +"");
                i++;
                ch = str.charAt(i);
            }

            lengths.add(num);
        }
        i++;

        for(int j=0; j<lengths.size(); j++) {
            int len = lengths.get(j);
            StringBuilder sb = new StringBuilder();
            for(int k=0; k<len; k++) {
                sb.append(str.charAt(i++));
            }
            list.add(sb.toString());
        }

        return list;
    }
}
