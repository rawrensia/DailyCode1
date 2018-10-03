#include<stdio.h>

#define ARRAY_SIZE 10

int test_sum(int array[], int k);
int main(){
    int a = 0, i = 0;
    int size, value, sum;
    printf("Enter the size of array: ");
    scanf("%d", &size);
    int given_array[size];
    while (size != 0){
        printf("Enter an integer: ");
        scanf("%d", &value);
        given_array[i] = value;
        i++;
        size--;
    }
    printf("Enter the sum that you wanna test: ");
    scanf("%d", &sum);
    a = test_sum(given_array, sum);
    if (a == 0) printf("False.");
    else
        printf("True");

    return 0;
}

int test_sum(int array[], int k){
    int temp_size = sizeof(&array);
    int temp_array[temp_size];
    temp_array[0] = 0;
    int a = 0, complement;
    while (a < sizeof(&array)){
        complement = k- array[a];
        for(int b = 0; b < sizeof(temp_array); b++){
            if (temp_array[b] == NULL) break;
            else if (array[a] == temp_array[b]) return 1;
        }
        temp_array[a] = k-array[a];
        a++;
    }

    return 0;
}
