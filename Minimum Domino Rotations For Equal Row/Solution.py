class Solution:
    def minDominoRotations(self, A: List[int], B: List[int]) -> int:
        
        if(len(A)<=1):
           return 0;
    
        def calcMin(target,A,B):
            count=0
            for i in range(len(A)):
                a,b=A[i],B[i]
                if(a==target):
                    continue
                else:
                    if(b==target):
                        count+=1
                    else:
                        count=float("inf")
                        break
            return count

        
        result=min(calcMin(A[0],A,B),calcMin(A[0],B,A),calcMin(B[0],A,B),calcMin(B[0],B,A))
        
        return result if result!=float("inf") else -1