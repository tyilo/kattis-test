#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n);

    int sum = 0;
    for (int i = 0; i < n; i++) {
        int x;
        scanf("%dd", &x);
        sum += x;
    }

    printf("%d\n", sum);
    return 0;
}
