#include <stdlib.h>
#include <iostream>
#include <stdio.h>

int normal_sorter( const void *first_arg, const void *second_arg ) {
    int first = *(int*)first_arg;
    int second = *(int*)second_arg;
    if ( first < second ) {
        return -1;
    } else if ( first == second ) {
        return 0;
    } else {
        return 1;
    }
}

int reverse_sorter( const void *first_arg, const void *second_arg ) {
    int first = *(int*)first_arg;
    int second = *(int*)second_arg;
    if ( first < second ) {
        return 1;
    } else if ( first == second ) {
        return 0;
    } else {
        return -1;
    }
}

int main() {
    int array[10];
    int i;
    /* fill array */
    for ( i = 0; i < 10; ++i ) {
        array[ i ] = rand() % 100;
    }
    for ( i = 0; i < 10; ++i ) {
        printf( "%d," ,array[ i ] );
    }
    printf( "\n");

    //void qsort(void *base, size_t nmemb, size_t size, int(*compar)(const void *, const void *));
    qsort( array, 10 , sizeof( int ), normal_sorter);
    for ( i = 0; i < 10; ++i ) {
        printf ( "%d," ,array[ i ] );
    }

    printf( "\n");

    qsort( array, 10 , sizeof( int ), reverse_sorter);
    for ( i = 0; i < 10; ++i ) {
        printf ( "%d," ,array[ i ] );
    }
}
