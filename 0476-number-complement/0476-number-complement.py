class Solution(object):
    def findComplement(self, num):
        ans = 0
        i = 0
        while(num > 0):
            x = num%2
            if(x == 1): x = 0
            elif(x == 0): x = 1
            ans = ans + pow(2,i)*x
            i+=1
            num/=2
        
        return ans



        """
        :type num: int
        :rtype: int
        """
        