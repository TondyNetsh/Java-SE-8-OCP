package GenericsAndCollections.question18;

class A{}
class B extends A {}
class C extends B {}
class D<C> {
    A a1 = new A();
    A a2 = new B();
}

//A, B. C is both a class and a type parameter. This means that within the class D, when we
//refer to C, it uses the type parameter. All of the choices that mention class C are incorrect
//because it no longer means the class C.