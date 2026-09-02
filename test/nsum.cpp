#include <iostream>

int main() {
    int n;
    std::cin >> n;
    int answer = 0;
    for (int i = 0; i < n; i++) {
        int x;
        std::cin >> x;
        answer += x;
    }
    std::cout << answer << std::endl;
    return 0;
}
