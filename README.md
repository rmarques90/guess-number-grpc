# Simple GuessNumber gRPC App

Just a simple application to test the concept of bidirectional streaming using gRPC.

Just run the App.java file, and open the channel. Once it is open, just try to guess the number as mapped in the interface.

Ex:

```json
{
  "guess": 10
}
```

The server will return if the number is higher or lower than the guessed number. If the number is correct, the server will return the number and close the connection.