import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
      convertedAmount: 0,
      rupees: ''
    };
  }

  // Counter methods
  incrementCounter = () => {
    this.setState(prevState => ({
      counter: prevState.counter + 1
    }));
  };

  sayHello = () => {
    alert("Hello! This is a static message.");
  };

  handleIncrement = () => {
    this.incrementCounter();
    this.sayHello();
  };

  decrementCounter = () => {
    this.setState(prevState => ({
      counter: prevState.counter - 1
    }));
  };

  // Welcome method
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic event handler
  handleClick = (e) => {
    alert("I was clicked");
    console.log(e); // SyntheticEvent object
  };

  // Currency converter methods
  handleRupeesChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euro = this.state.rupees / 85; // Assuming 1 Euro = 85 INR
    this.setState({ convertedAmount: euro.toFixed(2) });
  };

  render() {
    return (
      <div className="App">
        <h1>React Event Handling Examples</h1>
        
        {/* Counter Example */}
        <div className="example-section">
          <h2>Counter Example</h2>
          <p>Counter Value: {this.state.counter}</p>
          <button onClick={this.handleIncrement}>Increment (with hello)</button><br/><br/>
          <button onClick={this.decrementCounter}>Decrement</button>
        </div>
        
        {/* Welcome Example */}
        <div className="example-section">
          <h2>Welcome Example</h2>
          <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
            Say Welcome
          </button>
        </div>
        
        {/* Synthetic Event Example */}
        <div className="example-section">
          <h2>Synthetic Event Example</h2>
          <button onClick={this.handleClick}>Click Me (Synthetic Event)</button>
        </div>
        
        {/* Currency Converter Example */}
        <div className="example-section">
          <h2>Currency Converter</h2>
          <form onSubmit={this.handleSubmit}>
            <label>
              Indian Rupees:
              <input 
                type="number" 
                value={this.state.rupees} 
                onChange={this.handleRupeesChange} 
              />
            </label>
            <button type="submit">Convert to Euro</button>
          </form>
          {this.state.convertedAmount > 0 && (
            <p>Euro Amount: {this.state.convertedAmount}</p>
          )}
        </div>
      </div>
    );
  }
}

export default App;