//: Playground - noun: a place where people can play

import Foundation

func input() -> String {
    return readLine(stripNewline: true) ?? ""
}

print("Inserta el valor de a:")
let a = Double(input()) ?? 0.0;

print("Inserta el valor de b:")
let b = Double(input()) ?? 0.0;

print("Inserta la función (+ - * /): ")
let op = input();

func selecciona(op: String) -> (Double, Double) -> Double {
    switch op {
    case "-":
        return {(a: Double, b: Double) -> Double in return a - b}
    case "/":
        return {a,b in return a / b}
    case "*":
        return {a,b in a * b}
    default:
        return {$0 + $1}
    }
}

print(selecciona(op)(a,b))
