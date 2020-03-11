#include <bits/stdc++.h>
#include "../crio/cpp/io/FastIO.hpp"
#include "../crio/cpp/io/ReadMatrix.hpp"
#include "../crio/cpp/io/PrintMatrix.hpp"
using namespace std;

class MatrixTraversal {
public:
    // Implement your solution by completing the below function	
    vector<int> traversalPath(vector<vector<int>>& matrix, int currPosX, int currPosY, int dirToMove, int stepsToMove) {
        vector<int> res;
	
        return res;
    }
};

int main() {
    FastIO();
	int n, m;
	cin >> n >> m;
	vector<vector<int>> matrix;
	ReadMatrix<int>().TwoDMatrix(n, m, matrix);

	int currPosX, currPosY, dirToMove, stepsToMove;
	cin >> currPosX >> currPosY;
	cin >> dirToMove >> stepsToMove;

	vector<int> result = MatrixTraversal().traversalPath(matrix, currPosX, currPosY, dirToMove, stepsToMove);
	PrintMatrix<int>().OneDMatrix(result, " ");
	return 0;
}
