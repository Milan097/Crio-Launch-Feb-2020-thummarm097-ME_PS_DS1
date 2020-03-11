#include <bits/stdc++.h>
#include "../crio/cpp/io/FastIO.hpp"
using namespace std;

class ValidParenthesis {
public:
    // Implement your solution by completing the below function	
    bool isValid(string s) {
	return true;
    }
};

int main() {
	FastIO();
	string s;
	getline(cin, s);
	bool result = ValidParenthesis().isValid(s);
	cout << boolalpha << result;
	return 0;
}
