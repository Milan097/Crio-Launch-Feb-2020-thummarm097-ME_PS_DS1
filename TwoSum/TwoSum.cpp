#include <bits/stdc++.h>
#include "../crio/cpp/io/FastIO.hpp"
#include "../crio/cpp/io/ReadMatrix.hpp"
#include "../crio/cpp/io/PrintMatrix.hpp"
using namespace std;

class TwoSum {
public:
    // Implement your solution by completing the below function	
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> v(2,0);

        return v;
    }
};

int main() {
	FastIO();
	int n, target;
	cin >> n;
	vector<int> nums;
	ReadMatrix<int>().OneDMatrix(n, nums);
	cin >> target;
	vector<int> result = TwoSum().twoSum(nums, target);
	PrintMatrix<int>().OneDMatrix(result, " ");
	return 0;
}
