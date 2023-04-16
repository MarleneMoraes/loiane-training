/* Usando a classe Deque */
class Deque {
    constructor() {
        this.count = 0;
        this.lowestCount = 0;
        this.items = {};
    }
}

addFront(element); {
    if (this.isEmpty()) {
        this.addBack(element);
    } else if (this.lowestCount > 0) {
        this.lowestCount--;
        this.items[this.lowestCount] = element;
    } else {
        for (let i = this.count; i > 0; i--) {
            this.items[i] = this.items[i - 1];
        }
        this.count++;
        this.lowestCount = 0;
        this.items[0] = element;
    }
}

addBack(element); {
    if (this.isEmpty()) {
        this.items[this.lowestCount] = element;
    } else {
        this.items[this.size - 1] = element;
    }
}

removeFront(); {
    if (this.isEmpty()) {
        return undefined;
    }

    const result = this.items[this.lowestCount];
    delete this.items[this.lowestCount];
    this.lowestCount++;
    return result;
}

removeBack(); {
    if (this.isEmpty()) {
        return undefined;
    }

    const result = this.items[this.size];
    delete this.items[this.size - 1];
    this.size--;
    return result;
}

peekFront(); {
    if (this.isEmpty()) {
        return undefined;
    }
    return this.items[this.lowestCount];
}

peekBack(); {
    if (this.isEmpty()) {
        return undefined;
    }
    return this.items[this.size - 1];
}

size(); {
    return this.count - this.lowestCount;
}

isEmpty(); {
    return this.size === 0;
}

clear(); {
    this.items = {};
    this.count = 0;
    this.lowestCount = 0;
}

const deque = new Deque();
console.log(deque.isEmpty()); // true
deque.addBack('John');
deque.addBack('Jack');
console.log(deque.toString()); // John,Jack

deque.addBack('Camila');
console.log(deque.toString()); // John,Jack,Camila
console.log(deque.size()); // 3
console.log(deque.isEmpty()); // false

deque.removeFront();
console.log(deque.toString); // Jack,Camila
deque.removeBack();
console.log(deque.toString); // Jack

deque.addFront('John');
console.log(deque.toString()); // John,Jack

