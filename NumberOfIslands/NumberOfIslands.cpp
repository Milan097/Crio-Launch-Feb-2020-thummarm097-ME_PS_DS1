 #include <bits/stdc++.h>
#include "../crio/cpp/io/FastIO.hpp"
#include "../crio/cpp/io/ReadMatrix.hpp"
#include "../crio/cpp/io/PrintMatrix.hpp"
using namespace std;

class NumberOfIslands {
public:
    // Implement your solution by completing the below function
    int numIslands(vector<string>& grid) {
        int x = 0;

        return x;
    }
};

int main() {
    FastIO();
	int n, m;
	cin >> n >> m;
	vector<string> grid;
	ReadMatrix<string>().OneDMatrix(n, grid);
	int result = NumberOfIslands().numIslands(grid);
	cout << result;
	return 0;
}
