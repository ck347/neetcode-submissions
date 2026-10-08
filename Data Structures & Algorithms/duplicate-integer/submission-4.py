class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique_numbers = []
        for num in nums:
            if num in unique_numbers:
                return True
            else:
                unique_numbers.append(num)
        
        return False
        