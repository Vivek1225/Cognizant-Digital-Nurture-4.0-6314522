import { createContext } from 'react';

const ThemeContext = createContext({
  theme: 'light',
  setTheme: () => {} // Add setter function to context
});

export default ThemeContext;