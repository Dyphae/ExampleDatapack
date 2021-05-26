package me.MASTRIO.ExampleDatapack;

import com.github.MASTRIO.Dyphae.Command;
import com.github.MASTRIO.Dyphae.Core.Datapack;
import com.github.MASTRIO.Dyphae.Core.Function;
import com.github.MASTRIO.Dyphae.Core.MCFunction;

public class ExampleDatapack extends Datapack {

  static Datapack datapack = new ExampleDatapack();

  public static void main(String[] args) {

    init(
      "Example Datapack",
      "example",
      "An example datapack",
      "MASTRIO",
      "1.0.0"
    );

    load = new String[] {
      Command.say("I am loaded, very pog")
    };
    tick = new String[] {
      Command.say("tick tock")
    };

    datapack.build();

  }

  @Override
  public void onBuild() {

    @MCFunction
    Function testFunction = new Function("test_function").setCommands(new String[] {
      Command.say("I am a test"),
      Command.give("@a", "minecraft:diamond", 1)
    }).init();

  }

}
