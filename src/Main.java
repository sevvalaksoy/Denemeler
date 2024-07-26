import com.workintech.example.BankAccount;

public class Main {
    public static void main(String[] args) {
        getFirstAndLastDigitSum(233245);
        hasSameLastDigit(12, 23, 35, 13, 16, 17);
        getLargestPrime(217);

        BankAccount account1 = new BankAccount(1234353, 2000.00, "Şevval", "sevvala@gmail.com", "ab123as");
        System.out.println(account1.getAccountBalance());
        account1.withdraw(2500);
        System.out.println(account1.getAccountBalance());
        account1.deposit(2500);
        System.out.println(account1.getAccountBalance());
        account1.withdraw(1500);
        System.out.println(account1.getAccountBalance());
    };

    /*  1-) getFirstAndLastDigitSum isminde bir method yazmanız istenmektedir. Bu metod bir adet int parametre alır.
 	- Method aldığı int değerin ilk rakamı ile son rakamını toplayıp, toplam değerini geri döndürmelidir.
        - Örneğin;
             * 1234567 => 7 + 1 = 8
  	     * 45897 => 4 + 7 = 11
             * 874521 => 8 + 1 = 9 */

    public static int getFirstAndLastDigitSum(int num){
        String st = Integer.toString(num);
        char[] digits = st.toCharArray();
        int firstDigit = Integer.parseInt(String.valueOf(digits[0]));
        int lastDigit = Integer.parseInt(String.valueOf(digits[digits.length-1]));
        System.out.println(firstDigit + lastDigit);
        return firstDigit + lastDigit;
    };
    /* 2-) hasSameLastDigit isminde bir method yazmanız istenmektedir. int tipinde parametreler almalıdır.(2 parametrede alabilir, 3 parametrede, 5 parametrede)
      - Methoda gelen parametlerdeki sayılardan herhangi ikisinin son rakamı aynıysa method true dönmeli. Eğer hiçbir parametrenin son rakamı aynı değilse method false dönmelidir.
      - Örneğin;
             * 12, 23, 35, 16, 17 => false
  	     * 12, 23, 35, 13, 16, 17 => true(13 ve 23 ün son rakamı aynı)
             * 10, 87, 23, 44, 56, 90 => true (10 ve 90) */
    public static boolean hasSameLastDigit(int... numbers){
        int[] check = new int[numbers.length];
        boolean result = false;
            for ( int i = 0; i < numbers.length; i++){
                char[] digits = Integer.toString(numbers[i]).toCharArray();
                int lastDigit = Integer.parseInt(String.valueOf(digits[digits.length-1]));
                check[i] = lastDigit;
            }
            for (int i = 0; i < check.length-1; i++){
                for ( int j = 1; j < check.length; j++){
                    if (check[i] == check[j]) {
                        result = true;
                        break;
                    }
                }
            }
            System.out.println(result);
            return result;
    }

    /*    3-) getLargestPrime isminde bir method yazmanız istenmektedir. int tipinde tek bir parametre almalıdır.
      - Method gelen parametrenin içerisindeki en büyük asal böleni bulmalı ve bu değeri döndürmelidir.
      - Örneğin;
              * getLargestPrime(21) => 7(3*7)
 	      * getLargestPrime(217) => 31 (7*31)
              * getLargestPrime(45) => 5(3*3*5)
 	      * getLargestPrime(0) => -1(Invalid)
	      * getLargestPrime(-1) => -1(Invalid) */

    public static int getLargestPrime(int number){
        if(number <= 1){
            System.out.println(-1 + "(Invalid)");
            return -1;
        } else if (number == 2){
            System.out.println(2);
            return 2;
        }
        int[] check = new int[number];
        int[] results = new int[number];
        for ( int i = 3; i <= (number); i++ ){
            if ( i % 2 == 0){
                continue;
            }
            if (number % i == 0){
                check[i-1] = i;
            }
        }
        for ( int k = 0; k < check.length; k++){
            int count = 0;
            for ( int j = 3; j <check.length; j++){
                if(check[k] % j == 0){
                    count++;
                    continue;
                }
            } if (count==1){
                results[k] = check[k];
            }
        }
        int result = 0;
        for(int num:results){
            if(num>result){
                result = num;
            }
        }
        System.out.println(result);
        return result;
    }
    /* OOP Intro
- BankAccount isminde bir sınıf oluşturunuz.
- BankAccount sınıfının 5 tane instance variable değeri olmalı.
- accountNumber, accountBalance, customerName, email, password(bu değişkenlerin typeları ne olmalı ?)
- Tüm sınıf değişkenleriniz encapsulation kuralına uygun yazılmalıdır.(Her bir değişken için getter ve setter metodlarını ekleyiniz.)
- BankAccount sınıfı içerisinde 2 tane method tanımlamalısınız. withdraw(para çekme) ve deposit(para yatırma).
- withdraw methodu parametre almalı ve aldığı parametre değerini accountBalance değerinden çıkarmalıdır.(accountBalance kesinlikle 0'dan küçük olamaz)
- withdraw metoduna gelen parametre accountBalance değerinden büyükse kullanıcıya bir uyarı verilmeli(System.out mesajı)
- deposit methodu parametre almalı ve aldığı parametre değerini accountBalance değerine eklemelidir. (edited) */

}



