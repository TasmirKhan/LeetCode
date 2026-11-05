class Solution {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int dayOfYear(String num) {
        String[] arr = num.split("-");
        boolean leapyear = false;

        int date = Integer.parseInt(arr[2]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[0]);

        leapyear = isLeapYear(year);
        int res = date + (month-1)*31;
        if(month > 2){
            if(leapyear){ res -= 2;}
            else { res -= 3;}
        } // feb set;
        if(month >4 && month <= 6){  res -= 1;     }
        if(month >6 && month <=9){   res -= 2;  } 
        if(month >9 && month <=11){   res -= 3; }
        if(month >11){   res -= 4;     }

        return res;

        
        

    }
}