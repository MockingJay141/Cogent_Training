import { Component } from "react";

class LifeCycle2 extends Component{

    constructor(props) {
        super(props)
        this.state = {
            name: 'Ryan'
        }
        console.log('Life cycle 2 Constructor')
    }

    static getDerivedStateFromProps(props, state){
        console.log('LifeCycle2  getDerivedStateFromProps')
        return null
    }

    componentDidMount() {
        console.log("Life Cycle 2 componentDidMount")
    }

    shouldComponentUpdate() {
        console.log("Life Cycle 2 shouldComponentUpdate")
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log("Life Cycle 2 getSnapshotBeforeUpdate")
        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        console.log("Life Cycle 2 ComponentDidUpdate")
    }

    render() {
        console.log("LifeCycle2 Render")
        return(
            <div>
                LifeCycle2
            </div>
        )
    }
}

export default LifeCycle2