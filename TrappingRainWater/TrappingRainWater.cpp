#include <bits/stdc++.h>
#include "../crio/cpp/io/FastIO.hpp"
#include "../crio/cpp/io/ReadMatrix.hpp"
using namespace std;

class TrappingRainWater {
public:
	// Implement your solution by completing the below function`	
	int trap(vector<int>& height) {
	    int ans = 0;

	    return ans;
	}
};

int main() {
	FastIO();
	int n;
	cin >> n;
	vector<int> heights;
	ReadMatrix<int>().OneDMatrix(n, heights);
	int result = TrappingRainWater().trap(heights);
	cout << result;
	return 0;
}
