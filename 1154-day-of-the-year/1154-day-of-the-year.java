class Solution {
    public int dayOfYear(String num) {
        
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int date = Integer.parseInt(num.substring(8));
        int month = Integer.parseInt(num.substring(5,7));
        int year = Integer.parseInt(num.substring(0,4));
        int res = date;

        if (month > 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days[1] = 29;
        }

        for(int i = 0 ; i < month - 1; i++){
            res += days[i];
        }
        return res;


        // String[] arr = num.split("-");
        // boolean leapyear = false;

        // int date = Integer.parseInt(arr[2]);
        // int month = Integer.parseInt(arr[1]);
        // int year = Integer.parseInt(arr[0]);

        // leapyear = isLeapYear(year);
        // int res = date + (month-1)*31;
        // if(month > 2){
        //     if(leapyear){ res -= 2;}
        //     else { res -= 3;}
        // } // feb set;
        // if(month >4 && month <= 6){  res -= 1;     }
        // if(month >6 && month <=9){   res -= 2;  } 
        // if(month >9 && month <=11){   res -= 3; }
        // if(month >11){   res -= 4;     }

        // return res;

        
        

    }
}