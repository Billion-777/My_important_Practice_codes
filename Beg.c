
// Triplets who's sum is equal to K(given sum)

// int main()
// {

//     int i, n, j, a[20], k, t,count=0;
//     printf("Enter the size \n");
//     scanf("%d", &n);
//     printf("Enter the Elements \n");
//     for (i=0; i<n; i++)
//         scanf("%d", &a[i]);
//     printf("Enter the sum to get in an array \n");
//     scanf("%d", &t);
//     for (i = 0; i < n; i++)
//     {
//         if (a[i] >= t)
//             continue;
//         for (j = i+1; j < n; j++)
//         {
//             if (a[i] + a[j] >= t)
//                 continue;
//             for (k = j+1; k < n; k++)
//             {
//                 if (a[i] + a[j] + a[k] == t)

//                     printf("\n%d + %d + %d = %d", a[i], a[j], a[k], t);
//                     count++;
//             }
//         }
//     }
//     if(!count)
//     {
//         printf("\nNo Triplets Possible");
//     }
//     return 0;
// }

////pointer to character

// #include<stdio.h>
// int main()
// {
//     char *p= "Hello";
//     printf("%c\n",*&*p);
//     p++;
//     printf("%s\n",p);
//     *p++;
//     printf("%c\n",p);
//     ++*p;
//     printf("%c\n",p);

// }

// int main()
// {
//     char s[] ={'a','b','c','\n','d','\0'};
//     char *p,*q;
//     p=s;
//     q=&s[3];
//     printf("%c",++*p + ++*q-32);
//     return 0;

// }

// #include<stdlib.h>
// #include<string.h>
// int main()
// {
//     // char s[] ={'a','b','c','\n','d','\0'};
//     char *p="gril";
//     int i,n=strlen(p);
//     *p=p[n];
//    for(i=0;i<n;i++)
//     printf("%s\n",(p+i));
//     return 0;

// }

// Rotate the array to 90 degree

// #include <stdlib.h>
// #include <string.h>
// int main()
// {
//     int i, n, j, m, a[10][10], b[10][10];
//     printf("Enter the row and column size\n");
//     scanf("%d%d", &m, &n);
//     printf("Enter the MATRIX\n");
//     for (i = 0; i < m; i++)
//     {
//         for (j = 0; j < n; j++)
//         {
//             scanf("%d", &a[i][j]);
//         }

//     }

//     if(n>0 && m>0){
//         for (i = 0; i < m; i++)
//         {
//             for (j = 0; j < n; j++)
//             {
//                 b[j][i] = a[i][j];
//             }
//         }

//     }
//         printf("The Array after rotating 90 degrees\n");
//         for (i = 0; i < m; i++)
//         {
//             for (j = 0; j < n; j++)
//             {
//                 printf("%d\t", b[i][j]);
//             }
//             printf("\n");
//         }

//         return 0;
//     }

#include <stdio.h>
#include <stdlib.h>


struct Node
{
    int data;
    struct Node *next;
};


void printList(struct Node *n)
{
    while (n != NULL)
    {
        printf("%d->", n->data);
        n = n->next;
    }
}


void insertion(struct Node **head_ref, int new_data)
{
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    //   struct Node *new_data=(struct Node*)malloc(sizeof(struct Node));
    //   struct Node *head_node=(struct Node*)malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
}



void appendend(struct Node **head_ref, int new_data)
{
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    struct Node *last = (*head_ref);
    new_node->data = new_data;
    new_node->next = NULL;
    if (*head_ref == NULL)
    {
        (*head_ref) = new_node;
        return;
    }
    while (last->next != NULL)
    {
        last = last->next;
    }
    last->next = new_node;
}



void delete(struct Node **head_ref, int del)
{
    struct Node *curr_node=(*head_ref);
    struct Node *prev_node=NULL;

    if((*head_ref) && (*head_ref)->data==del)
    {
        (*head_ref)=(*head_ref)->next;
        free(curr_node);
    }

    while(curr_node && curr_node->data!=del)
    {
        prev_node=curr_node;
        curr_node=curr_node->next;
    }

    if(curr_node==NULL)
    {
        return;
    }

    prev_node->next = curr_node->next;
    free(curr_node);

}




int main()

{
    struct Node *head = NULL;
    int c, n;

    do
    {
        printf("\nEnter your choice for the cases\n");
        scanf("%d", &n);

        switch (n)
        {
        case 1:
            printf("\nEnter the element or node to be inserted from front\n");
            scanf("%d", &c);
            insertion(&head, c);
            printList(head);
            break;

        case 2:
            printf("\nEnter the element or node to be inserted at End\n");
            scanf("%d", &c);
            appendend(&head, c);
            printList(head);
            break;
        case 3:
            printf("\nEnter the  node to be deleted at any position\n");
            scanf("%d", &c);
            delete (&head, c);
            printList(head);
            break;
        case 5:
            exit(0);
        default:
            printf("please enter the valid input\n");
        }
    } while (1);

    //  insertion(&head,20);
    //  insertion(&head,30);
    //  insertion(&head,40);

    //  printList(head);

    return 0;
}
