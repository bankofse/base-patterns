using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plugin
{
    public class start
    {
        IIdGenerator Plugin { get; set; }

        public start()
        {
            Plugin = new IdGenerator();

            Console.WriteLine(IdGenerator.getId());
        }
    }
}
