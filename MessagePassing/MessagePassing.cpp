#include<bits/stdc++.h>
using namespace std;

// Implement your solution by completing the below function
bool canMessageBePassed(int n, vector<vector<int> > maze) {
        bool possible = true;

	return possible;
}

int main() {
        int n , s , m;
        cin >> n >> s >> m;
        assert(1 <= n && n <= 500);
        assert(1 <= s && s <= 1e5);
        assert(1 <= m && m <= 1e5);

        vector<vector<int> > maze(n , vector<int>(n , 0));
        maze[0][0] = s;

        for(int i = 0 ; i < m ; ++i) {
            int x , y , p;
            cin >> x >> y >> p;
            assert(0 <= x && x < n);
            assert(0 <= y && y < n);
            assert(1 <= p && p <= 1e5);
            maze[x][y] = max(maze[x][y] , p);
        }
        bool possible = canMessageBePassed(n, maze);
        cout << (possible ? "Yes\n" : "No\n");
}


