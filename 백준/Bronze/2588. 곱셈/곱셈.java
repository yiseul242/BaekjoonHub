import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());       
        
        bw.write(num1 * (num2 % 10) + "\n"); // num1 * (num2 일의 자리)
        bw.write(num1 * ((num2 / 10) % 10) + "\n"); // num1 * (num2 십의 자리)
        bw.write(num1 * (num2 / 100) + "\n"); // num1 * (num2 백의 자리)
        bw.write(num1 * num2 + "\n");
        bw.close();
    }
}