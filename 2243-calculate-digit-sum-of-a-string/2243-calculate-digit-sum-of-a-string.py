class Solution:
    def digitSum(self, s: str, k: int) -> str:
        self.s = s
        self.k = k
        lst = list(s)
        i = 0
        while(len(lst) > k):
            lst2 = []
            i = 0
            while( i < len(lst)):
                x = 0
                x += sum(int(ch) for ch in lst[i : i+k])
                lst2.extend(str(x))
                i = i+k
            lst = lst2

        return "".join(lst)

            





        