import { Component } from "react";


class Counter extends Component{

    constructor() {
        super()
        this.state = {
            count: 0
        }
    }

    increment() {
        this.setState((prevState) => ({
            count: prevState.count + 1
        }))
    }

    incrementFive() {
        console.log("Inside incrementFive")
        this.increment()
        this.increment()
        this.increment()
        this.increment()
        this.increment()
    }

    render(){
        return (
            <div>
                <div>Count - {this.state.count}</div>
                <button onClick={() => this.incrementFive()}>increment</button>
            </div>
        )
    }
}

export default Counter