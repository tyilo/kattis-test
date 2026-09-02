use std::io;

fn main() {
    let input = io::read_to_string(io::stdin()).unwrap();
    let mut iter = input.split_whitespace();

    let n: usize = iter.next().unwrap().parse().unwrap();

    let mut answer = 0;
    for _ in 0..n {
        let num: i32 = iter.next().unwrap().parse().unwrap();
        answer += num;
    }

    println!("{answer}");
}
