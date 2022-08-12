import java.util.*;

class Ciphers
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Select Cipher\n");
		System.out.println("1:Mono-alphabetic\n");
		System.out.println("2:Poly-alphabetic\n");
		int ch = sc.nextInt();

		switch(ch)
		{
			case 1: 
				System.out.println("Select Cipher\n");
				System.out.println("1:Encryption\n");
				System.out.println("2:Decryption\n");
				int ch1 = sc.nextInt();

				switch(ch1)
				{
					case 1:
						String pl = sc.next();
						int key = sc.nextInt();
						char ttext;
						String ctext = "";
						int tcode = 0; 
						int x = pl.length();

					for(int i=0;i<x;i++)
					{
						if(Character.isUpperCase(pl.charAt(i)))
						{
							tcode = ((pl.charAt(i) - 65 + key) % 26 + 65);
							//System.out.println(tcode);
							ttext = (char)tcode;
							ctext = ctext + ttext;
						}
						else
						{
							tcode = ((pl.charAt(i) - 97 + key) % 26  + 97);
							//System.out.println(tcode);
							ttext = (char)tcode;
							ctext = ctext + ttext;
						}
					}
					System.out.println(ctext);
					break;

					case 2:
						pl = sc.next();
						key = sc.nextInt();
						ctext = "";
						tcode = 0; 
						x = pl.length();
						key = 26 - key;
						for(int i=0;i<x;i++)
						{
							if(Character.isUpperCase(pl.charAt(i)))
							{
								tcode = ((pl.charAt(i) - 65 + key) % 26 + 65);
								//System.out.println(tcode);
								ttext = (char)tcode;
								ctext = ctext + ttext;
							}
							else
							{
								tcode = ((pl.charAt(i) - 97 + key) % 26  + 97);
								//System.out.println(tcode);
								ttext = (char)tcode;
								ctext = ctext + ttext;
							}
						}
					System.out.println(ctext);
					break;
				}
				break;

				case 2:
					System.out.println("Select Cipher\n");
					System.out.println("1:Encryption\n");
					System.out.println("2:Decryption\n");
					int ch2 = sc.nextInt();
					switch(ch2)
					{
						case 1:
							String pl = sc.next();
			 				int key = sc.nextInt();
							int x = pl.length();
							char ttext;
							int tcode =0; 
							String ctext ="";

							for(int i=0;i<x;i++)
							{
								if(Character.isUpperCase(pl.charAt(i)))
								{
									tcode = ((pl.charAt(i) - 65 + key) % 26 + 65);
									//System.out.println(tcode);
									key = pl.charAt(i) - 65;
									//System.out.println(key);
									ttext = (char)tcode;
									ctext = ctext + ttext;
								}
								else
								{
									tcode = ((pl.charAt(i) - 97 + key) % 26 + 97);
									//System.out.println(tcode);
									key = pl.charAt(i) - 97;
									//System.out.println(key);
									ttext = (char)tcode;
									ctext = ctext + ttext;
								}
							}
							System.out.println(ctext);
							break;

					case 2:
						pl = sc.next();
						key = sc.nextInt();
						x = pl.length();
						tcode =0; 
						ctext ="";
						for(int i=0;i<x;i++)
						{
							if(Character.isUpperCase(pl.charAt(i)))
							{
								tcode = ((pl.charAt(i) - 65 - key) % 26 + 65);
								key = tcode - 65;
								//System.out.println(key);
								if(key<0)
								{
									tcode = tcode + 26;
								}
								//System.out.println(tcode +" "+i);
								ttext = (char)tcode;
								ctext = ctext + ttext;
							}
							else
							{
								tcode = ((pl.charAt(i) - 97 - key) % 26 + 97);
								//System.out.println(tcode);
								key = tcode - 97;
								//System.out.println(key);
								if(key<0)
								{
									tcode = tcode + 26;
								}
								ttext = (char)tcode;
								ctext = ctext + ttext;
							}
						}
							System.out.println(ctext);
						break;
					}
				break;
		}
	}
}