package leetcode.string.easy;

public class No_657_RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
        if (moves.length() == 0) {
			return true;
		}
        if (moves.length() % 2 == 1) {
			return false;
		}
        int[] temp = new int[2];  //2位保存水平和垂直方向距离，如上则temp[1]++
        temp[1] = 0;
        temp[0] = 0;
        for (int i = 0; i < moves.length(); i++) {
        	if (moves.charAt(i) == 'R') {
				temp[0]++;
			} 
        	else if (moves.charAt(i) == 'L') {
				temp[0]--;
			}
        	else if (moves.charAt(i) == 'U') {
				temp[1]++;
			}
        	else if (moves.charAt(i) == 'D') {
				temp[1]--;
			}
		}
        return temp[0] == 0 && temp[1] == 0;
    }
    
     public boolean judgeCircle2(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
    
     public boolean judgeCircle3(String moves) {
        int left = 0,top = 0;
        char[] c = moves.toCharArray();
        for(int i = 0;i<c.length;i++){
            switch(c[i]){
                case 'U':
                    top++;
                    break;
                case 'D':
                    top--;
                    break;
                case 'L':
                    left++;
                    break;
                case 'R':
                    left--;
                    break;
            }
        }
        return left == 0 && top == 0;
    }
    public boolean judgeCircle4(String moves) {
        int a[] = new int[100];
		for (char c : moves.toCharArray() ) {
			a[c]++;
		}
		return a['R'] == a['L'] && a['U'] == a['D'];
    }
}
