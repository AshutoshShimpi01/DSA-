{
  public static void main(String[] args) {

    int arr[]={8,32,64,9,22,2,77,27,99,12,17};

    int smallest = arr[0];
    int largest = arr[0];

    for(int i=0; i<=10; i++)
    {
      if (arr[i] < smallest) smallest = arr[i];

      if (arr[i] > largest) largest = arr[i];
    }

    System.out.println("smallest value is : " + smallest);
    
    System.out.println("largestest value is :" + largest);

  }
}

/*

smallest value is :2 
largestest value is : 99


*/
