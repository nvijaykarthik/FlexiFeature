import React,{ Component } from "react";
import { connect } from "react-redux";

const mapDispatchToProps=(dispatch)=>{
    return{
        setTitle:(title)=>{
            dispatch({type:"SET_TITLE",payload:title})
        }
    }

}

class ConnectedHome extends Component{
    state={
        title:"Home"
    }
   
    componentDidMount(){
        this.props.setTitle(this.state.title)
    }

    render(){
        return(
            <div>
                <h1>Home</h1>
            </div>
        )
    }
}


const Home=connect(null,mapDispatchToProps)(ConnectedHome)
export default Home;