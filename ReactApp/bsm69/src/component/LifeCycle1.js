import React,{ Component } from "react";
import LifeCycle2 from "./LifeCycle2";

class LifeCycle1 extends Component{

    constructor(props) {
        super(props)
        this.state = {
            name: this.props.name
        }
        console.log('Life cycle 1 Constructor')
    }

    static getDerivedStateFromProps(props, state){
        console.log('LifeCycle1  getDerivedStateFromProps')
        return null
    }

    componentDidMount() {
        console.log("Life Cycle 1 componentDidMount")
    }

    shouldComponentUpdate() {
        console.log("Life Cycle 1 shouldComponentUpdate")
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log("Life Cycle 1 getSnapshotBeforeUpdate")
        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        console.log("Life Cycle 1 ComponentDidUpdate")
    }

    changeState = () => {
        this.setState({
            name: "Max"
        })
    }

    render() {
        console.log("LifeCycle1 Render")
        return(
            <div>
                <div>LifeCycle1 {this.state.name}</div>
                <button onClick={this.changeState}>Change State</button>
                <LifeCycle2 />
            </div>
        )
    }
}

export default LifeCycle1